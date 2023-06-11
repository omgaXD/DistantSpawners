package com.omga.distantspawners.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BaseSpawner;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BaseSpawner.class)
public class BaseSpawnerPatchMixin {
    @Inject(at = @At("HEAD"), method = "isNearPlayer", cancellable = true)
    private void isNearPlayer(Level p_151344_, BlockPos p_151345_, CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(true);
    }
}
