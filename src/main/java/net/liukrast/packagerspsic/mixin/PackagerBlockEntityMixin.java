package net.liukrast.packagerspsic.mixin;

import com.simibubi.create.content.contraptions.actors.psi.PortableStorageInterfaceBlockEntity;
import com.simibubi.create.content.logistics.packager.PackagerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PackagerBlockEntity.class)
public class PackagerBlockEntityMixin {

    @Inject(method = "supportsBlockEntity", at = @At("RETURN"), cancellable = true)
    private void supportsBlockEntity(BlockEntity target, CallbackInfoReturnable<Boolean> cir) {
        if(target instanceof PortableStorageInterfaceBlockEntity) cir.setReturnValue(true);
    }
}
