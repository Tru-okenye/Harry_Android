package com.example.harrypotter.core.domain.use_case

import com.example.harrypotter.core.data.HarryPotterApi

class GetSpells(
    private val harryPotterApi: HarryPotterApi
) {
    suspend operator fun invoke() = harryPotterApi.getSpells()
}