package Mizore.Client;

import Mizore.Common.CommonProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static Mizore.Utils.Refrences.itemManager;

/**
 * Created by frost on 2/28/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void PreInit(FMLPreInitializationEvent event) {
        super.PreInit(event);

    }

    @Override
    public void Init(FMLInitializationEvent event) {
        super.Init(event);
        itemManager.registerRenderers();

    }

    @Override
    public void PostInit(FMLPostInitializationEvent event) {
        super.PostInit(event);
    }
}
