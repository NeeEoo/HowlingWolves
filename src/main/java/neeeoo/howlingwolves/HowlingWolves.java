package neeeoo.howlingwolves;

import neeeoo.howlingwolves.sound.HowlingWolvesSoundEvents;
import net.fabricmc.api.ModInitializer;

public class HowlingWolves implements ModInitializer {
	public static final String MOD_ID = "howlingwolves";

	@Override
	public void onInitialize() {
		HowlingWolvesSoundEvents.register();
	}
}
