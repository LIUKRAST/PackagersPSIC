package net.liukrast.packagerspsic.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.simibubi.create.content.logistics.packager.PackagerBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PackagerBlock.class)
public class PackagerBlockMixin {
    @ModifyExpressionValue(method = "getStateForPlacement", at = @At(value = "INVOKE", target = "Lcom/tterrag/registrate/util/entry/BlockEntry;has(Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private boolean getStateForPlacement(boolean original) {
        return false;
    }
}
