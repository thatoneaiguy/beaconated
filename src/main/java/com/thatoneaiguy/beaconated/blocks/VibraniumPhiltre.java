package com.thatoneaiguy.beaconated.blocks;

import com.thatoneaiguy.beaconated.blocks.entities.VibraniumIlluminatorBlockEntity;
import com.thatoneaiguy.beaconated.blocks.entities.VibraniumPhiltreBlockEntity;
import com.thatoneaiguy.beaconated.init.BeaconatedBlockEntities;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VibraniumPhiltre extends BlockWithEntity implements BlockEntityProvider {
    public VibraniumPhiltre(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VibraniumPhiltreBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, BeaconatedBlockEntities.PHILTRE, VibraniumPhiltreBlockEntity::tick);
    }
}

