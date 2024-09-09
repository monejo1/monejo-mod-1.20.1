package com.monejo.monejomod.mixin;


import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.block.custom.DwarfFireBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public class AbstractFireBlockMixin {
    @Inject(at = @At("HEAD"), method = "getState", cancellable = true)
    private static void  monejomod$modifyGetState(BlockView world, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if(DwarfFireBlock.isDwarfBase(blockState)) {
            cir.setReturnValue(ModBlocks.DWARF_FIRE.getDefaultState());

        }
    }

}
