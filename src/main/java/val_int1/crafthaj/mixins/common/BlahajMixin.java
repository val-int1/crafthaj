package val_int1.crafthaj.mixins.common;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import hibi.blahaj.Blahaj;

@Mixin(Blahaj.class)
public class BlahajMixin {

	@Inject(method="injectTrades", at=@At("HEAD"), cancellable=true, remap=false)
	private static void crafthaj_injectInjectTrades(CallbackInfo info) {
		info.cancel(); // No trade, only craft
	}
	
}
