package com.birdasia

object quiz_Constants {

    fun getQuestions():ArrayList<quiz_question>{
        val questions=ArrayList<quiz_question>()

        val quest1=quiz_question(
            1,
            "Family name for Lophura bulweri?",
            0,
            mutableListOf<String>("Calyptomena hosii",
                "Phasianidae",
                "Calyptomena whiteheadi",
                "White-crowned Shama"),
            1
        )

        val quest2=quiz_question(
            2,
            "Arachothera everetti local name for?",
            0,
            mutableListOf<String>("Whitehead’s Spiderhunter",
                "Friendly Bush Warbler",
                "Bornean Spiderhunter",
                "Mountain Black-eye"),
            2
        )

        val quest3=quiz_question(
            3,
            "Songbird in the bulbul family.Which one is SongBird?",
            0,
            mutableListOf<String>("Yellow-vented bulbul",
                "Mountain peacock-pheasant",
                "Pale-faced bulbul",
                "Malayan peacock-pheasant"),
            2
        )

        val quest4=quiz_question(
            4,
            "Where is Bornean barbet habitats  ?",
            0,
            mutableListOf<String>("Myammar and Indonesia",
                "Malaysia and Singapore",
                "Indonesia and Malaysia",
                "Thailand and Indonesia"),
            2
        )

        questions.add(quest1)
        questions.add(quest2)
        questions.add(quest3)
        questions.add(quest4)

        return questions
    }

}