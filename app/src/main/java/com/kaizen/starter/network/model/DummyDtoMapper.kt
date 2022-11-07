package com.kaizen.starter.network.model

import com.kaizen.starter.data.model.Dummy
import com.kaizen.starter.data.util.NetworkMapper

class DummyDtoMapper : NetworkMapper<DummyResponse, Dummy> {

    override fun mapToDomainModel(model: DummyResponse): Dummy {
        return Dummy(
            id = model.id,
            imageUrl = model.imageUrl,
            displayName = model.displayName
        )
    }

    override fun mapFromDomainModel(domainModel: Dummy): DummyResponse {
        return DummyResponse(
            id = domainModel.id,
            displayName = domainModel.displayName,
            imageUrl = domainModel.imageUrl,
        )
    }

    fun toDomainList(initial: List<DummyResponse>): List<Dummy> {
        return initial.map { mapToDomainModel(it) }
    }

    fun fromDomainList(initial: List<Dummy>): List<DummyResponse> {
        return initial.map { mapFromDomainModel(it) }
    }


}
