package com.kaizen.starter.data.util

import com.kaizen.starter.network.model.DummyResponse

/**
 * This interface must be used in order to convert a DTO object received from the server
 * to an simple object to eventually display it when needed
 *
 * see example at [DummyDtoMapper]
 */
interface NetworkMapper<T, DomainModel> {
    fun mapToDomainModel(model: DummyResponse): DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T
}