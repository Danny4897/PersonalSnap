package com.kaizen.starter.room

import com.kaizen.starter.data.model.Dummy
import javax.inject.Inject

class DummyEntityMapper
@Inject
constructor() :
    EntityMapper<DummyEntity, Dummy> {

    override fun mapFromEntity(entity: DummyEntity): Dummy {
        return Dummy(
            id = entity.id.toString(),
            imageUrl = entity.title,
            ""
        )
    }

    override fun mapToEntity(domainModel: Dummy): DummyEntity {
        return DummyEntity(
            id = Integer.parseInt(domainModel.id!!),
            title = domainModel.imageUrl ?: "",
            "",
            "",
            ""
        )
    }
}











