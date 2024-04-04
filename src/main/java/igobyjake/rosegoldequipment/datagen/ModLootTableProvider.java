package igobyjake.rosegoldequipment.datagen;

import igobyjake.rosegoldequipment.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.loot.LootTable;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_ROSE_GOLD_BLOCK);
        addDrop(ModBlocks.ROSE_GOLD_BLOCK);
        addDrop(ModBlocks.ROSE_GOLD_DOOR, doorLikeDrops(ModBlocks.ROSE_GOLD_DOOR));
        addDrop(ModBlocks.ROSE_GOLD_TRAPDOOR);
    }

    public LootTable.Builder doorLikeDrops(Block block) {
        return this.dropsWithProperty(block, DoorBlock.HALF, DoubleBlockHalf.LOWER);
    }
}
