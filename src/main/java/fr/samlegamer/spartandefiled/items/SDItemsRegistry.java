package fr.samlegamer.spartandefiled.items;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import fr.samlegamer.spartandefiled.SpartanDefiled;
import lykrast.defiledlands.common.init.ModItems;
import lykrast.defiledlands.common.util.CreativeTabDL;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber
public class SDItemsRegistry
{
	private static final ToolMaterialEx material = new ToolMaterialEx("umbrium", "ingotUmbrium", SpartanDefiled.MODID, 8724360, 8132065, ModItems.materialUmbrium.getHarvestLevel(), ModItems.materialUmbrium.getMaxUses(), ModItems.materialUmbrium.getEfficiency(), ModItems.materialUmbrium.getAttackDamage(), ModItems.materialUmbrium.getEnchantability());
    private static final Set<Item> ALL_ITEMS = new HashSet<>();

    private static void createWeaponry(boolean config1, boolean config2, Set<Item> item_set, Item spartan, String reg)
    {
    	if (!config1 && !config2)
		{
    		Item item = spartan;
			SpartanWeaponryAPI.addItemModelToRegistry(item, SpartanDefiled.MODID, reg+"_umbrium");
			item_set.add(item);
		}
    }
    
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
	{
	    Set<Item> item_set = new LinkedHashSet<>();

		OreDictionary.registerOre("ingotUmbrium", ModItems.umbriumIngot);
		
		createWeaponry(ConfigHandler.disableDagger, false, item_set, SpartanWeaponryAPI.createDagger(material, SpartanDefiled.MODID, CreativeTabDL.instance), "dagger");
		createWeaponry(ConfigHandler.disableMace, false, item_set, SpartanWeaponryAPI.createMace(material, SpartanDefiled.MODID, CreativeTabDL.instance), "mace");
		createWeaponry(ConfigHandler.disableParryingDagger, false, item_set, SpartanWeaponryAPI.createParryingDagger(material, SpartanDefiled.MODID, CreativeTabDL.instance), "parrying_dagger");
		createWeaponry(ConfigHandler.disableBoomerang, false, item_set, SpartanWeaponryAPI.createBoomerang(material, SpartanDefiled.MODID, CreativeTabDL.instance), "boomerang");
		createWeaponry(ConfigHandler.disableBattleaxe, false, item_set, SpartanWeaponryAPI.createBattleaxe(material, SpartanDefiled.MODID, CreativeTabDL.instance), "battleaxe");
		createWeaponry(ConfigHandler.disableLongsword, false, item_set, SpartanWeaponryAPI.createLongsword(material, SpartanDefiled.MODID, CreativeTabDL.instance), "longsword");
		createWeaponry(ConfigHandler.disableKatana, false, item_set, SpartanWeaponryAPI.createKatana(material, SpartanDefiled.MODID, CreativeTabDL.instance), "katana");
		createWeaponry(ConfigHandler.disableSaber, false, item_set, SpartanWeaponryAPI.createSaber(material, SpartanDefiled.MODID, CreativeTabDL.instance), "saber");
		createWeaponry(ConfigHandler.disableRapier, false, item_set, SpartanWeaponryAPI.createRapier(material, SpartanDefiled.MODID, CreativeTabDL.instance), "rapier");
		createWeaponry(ConfigHandler.disableGreatsword, false, item_set, SpartanWeaponryAPI.createGreatsword(material, SpartanDefiled.MODID, CreativeTabDL.instance), "greatsword");
		createWeaponry(ConfigHandler.disableHammer, false, item_set, SpartanWeaponryAPI.createHammer(material, SpartanDefiled.MODID, CreativeTabDL.instance), "hammer");
		createWeaponry(ConfigHandler.disableWarhammer, false, item_set, SpartanWeaponryAPI.createWarhammer(material, SpartanDefiled.MODID, CreativeTabDL.instance), "warhammer");
		createWeaponry(ConfigHandler.disableSpear, false, item_set, SpartanWeaponryAPI.createSpear(material, SpartanDefiled.MODID, CreativeTabDL.instance), "spear");
		createWeaponry(ConfigHandler.disableHalberd, false, item_set, SpartanWeaponryAPI.createHalberd(material, SpartanDefiled.MODID, CreativeTabDL.instance), "halberd");
		createWeaponry(ConfigHandler.disablePike, false, item_set, SpartanWeaponryAPI.createPike(material, SpartanDefiled.MODID, CreativeTabDL.instance), "pike");
		createWeaponry(ConfigHandler.disableLance, false, item_set, SpartanWeaponryAPI.createLance(material, SpartanDefiled.MODID, CreativeTabDL.instance), "lance");
		createWeaponry(ConfigHandler.disableLongbow, ConfigHandler.woodenLongbowOnly, item_set, SpartanWeaponryAPI.createLongbow(material, SpartanDefiled.MODID, CreativeTabDL.instance, null), "longbow");
		createWeaponry(ConfigHandler.disableCrossbow, ConfigHandler.woodenCrossbowOnly, item_set, SpartanWeaponryAPI.createCrossbow(material, SpartanDefiled.MODID, CreativeTabDL.instance, null), "crossbow");
		createWeaponry(ConfigHandler.disableThrowingKnife, false, item_set, SpartanWeaponryAPI.createThrowingKnife(material, SpartanDefiled.MODID, CreativeTabDL.instance), "throwing_knife");
		createWeaponry(ConfigHandler.disableThrowingAxe, false, item_set, SpartanWeaponryAPI.createThrowingAxe(material, SpartanDefiled.MODID, CreativeTabDL.instance), "throwing_axe");
		createWeaponry(ConfigHandler.disableJavelin, false, item_set, SpartanWeaponryAPI.createJavelin(material, SpartanDefiled.MODID, CreativeTabDL.instance), "javelin");
		createWeaponry(ConfigHandler.disableGlaive, false, item_set, SpartanWeaponryAPI.createGlaive(material, SpartanDefiled.MODID, CreativeTabDL.instance), "glaive");
		createWeaponry(ConfigHandler.disableQuarterstaff, false, item_set, SpartanWeaponryAPI.createQuarterstaff(material, SpartanDefiled.MODID, CreativeTabDL.instance), "quarterstaff");
		createWeaponry(ConfigHandler.disableScythe, false, item_set, SpartanWeaponryAPI.createScythe(material, SpartanDefiled.MODID, CreativeTabDL.instance), "scythe");

		for (Item it : item_set)
		{
	        event.getRegistry().register(it);
	    }
	    ALL_ITEMS.forEach(event.getRegistry()::register);
	}
		
	@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
	{
        ALL_ITEMS.stream()
                .filter(item -> item.getRegistryName() != null)
                .forEach(item ->
                        ModelLoader.setCustomModelResourceLocation(item, 0,
                                new ModelResourceLocation(item.getRegistryName(), "inventory")));
    }
}