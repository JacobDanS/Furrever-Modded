package korejjamjar.furrevermodded;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = "kfmm", name = "Furrever Modded", version = "1.0")
public class FurreverModded {
	
	public static Item itemFidgetCube;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//Config handling
		itemFidgetCube = new ItemFidgetCube().setUnlocalizedName("ItemFidgetCube");
		GameRegistry.registerItem(itemFidgetCube, itemFidgetCube.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GIO and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
