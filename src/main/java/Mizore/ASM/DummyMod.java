package Mizore.ASM;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

import static Mizore.Utils.Refrences.MODID;

/**
 * Created by frost on 3/6/2017.
 */
public class DummyMod extends DummyModContainer {
    public DummyMod(){
        super(new ModMetadata());
        ModMetadata metadata = getMetadata();
        metadata.modId = MODID+"asmmodule";
        metadata.version = "1.0";
        metadata.parent = MODID;
    }
}
