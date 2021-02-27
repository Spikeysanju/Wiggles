/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.spikeysanju.wiggles.data

import dev.spikeysanju.wiggles.R
import dev.spikeysanju.wiggles.model.Dog
import dev.spikeysanju.wiggles.model.Owner

object FakeDogDatabase {

    val ownerData = Owner("Spikey", "Android Developer & UX Designer", R.drawable.owner)

    val dogList = listOf(
        Dog(
            1, "Parkinson", 1.4, "Male", "Brown",
            12.1, "381", R.drawable.blue_dog, "", ownerData
        ),

        Dog(
            2, "Parkinson", 1.4, "Male", "Brown",
            12.1, "429", R.drawable.white_dog, "", ownerData
        ),
        Dog(
            3, "Parkinson", 1.4, "Male", "Brown",
            12.1, "587", R.drawable.red_dog, "", ownerData
        ),
        Dog(
            4, "Parkinson", 1.4, "Male", "Brown",
            12.1, "629", R.drawable.yellow_dog, "", ownerData
        ),
        Dog(
            5, "Parkinson", 1.4, "Male", "Brown",
            12.1, "887", R.drawable.orange_dog, "", ownerData
        )
    )
}
