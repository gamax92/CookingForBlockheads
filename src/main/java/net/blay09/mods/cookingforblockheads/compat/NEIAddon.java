package net.blay09.mods.cookingforblockheads.compat;

import codechicken.nei.api.API;
import net.blay09.mods.cookingforblockheads.client.gui.GuiRecipeBook;

public class NEIAddon {
	 public NEIAddon() {
		 API.addFastTransferExemptContainer(GuiRecipeBook.class);
	 }
}
