package com.sr.zoo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sr.zoo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var animalsList = ArrayList<ZooAnimal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        animalsList.add(
            ZooAnimal("Bear", "Bear definition is - any of a family (Ursidae of the order Carnivora) of large heavy mammals of America and Eurasia that have long shaggy hair, rudimentary tails, and plantigrade feet and feed largely on fruit, plant matter, and insects as well as on fleshBear likes honey.", R.drawable.bear)
        )
        animalsList.add(
            ZooAnimal("Caribou", "The caribou is well adapted to its environment. Caribous are large even toed mammals that measure 1.2 – 2.2 metres (4 – 7.25 feet) in length and stand 1.2 – 1.5 metres (4 – 5 foot at shoulder height. They can weigh between 60 – 318 kilograms (130 – 700 pounds). Their coats are short, thick and coloured brown in summer turning grey in the winter. He likes to hangout with others.", R.drawable.caribou)
        )
        animalsList.add(
            ZooAnimal("Gorilla", "Gorillas are ground-dwelling, predominantly herbivorous apes that inhabit the forest of central Sub-Saharan Africa. The genus Gorilla is divided into two species: the eastern gorillas and the western gorillas (both critically endangered), and either four or five subspecies. They are the largest living primates. The DNA of gorillas is highly similar to that of humans, from 95 to 99% depending on what is included. They use to behave like human.", R.drawable.gorilla)
        )
        animalsList.add(
            ZooAnimal("Lemur", "Lemur, generally, any primitive primate except the tarsier; more specifically, any of the indigenous primates of Madagascar. Most lemurs of Madagascar and the nearby Comoro Islands have large eyes, foxlike faces, monkeylike bodies, and long hind limbs. They are very shy.", R.drawable.lemur)
        )
        animalsList.add(
            ZooAnimal("Tiger", "Tigers generally gain independence at two years of age and attain sexual maturity at age three or four for females and at four or five years for males. Juvenile mortality is high howeverabout half of all cubs do not survive more than two years. Tigers have been known to reach up to 20 years of age in the wild. They are mad of meats.", R.drawable.tiger)
        )
        animalsList.add(
            ZooAnimal("Wolf", "Wolf, any of two species of wild doglike carnivores. The gray, or timber, wolf (Canis lupus) is the better known. It is the largest nondomestic member of the dog family (Canidae) and inhabits vast areas of the Northern Hemisphere. They are remarkable at team working.", R.drawable.wolf)
        )

        val adapter = RecyclerAdapter(animalsList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}