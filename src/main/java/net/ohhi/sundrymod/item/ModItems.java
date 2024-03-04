package net.ohhi.sundrymod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ohhi.sundrymod.OhhiSundryMod;
import net.ohhi.sundrymod.item.custom.AwakenMoai;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OhhiSundryMod.MOD_ID);


    public static final RegistryObject<Item> MOAI_GOODS = ITEMS.register("moai_goods",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOAI = ITEMS.register("raw_moai",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AWAKEN_MOAI = ITEMS.register("awaken_moai",
            () -> new AwakenMoai(new Item.Properties().durability(121)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
