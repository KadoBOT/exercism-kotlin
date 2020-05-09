val rna = mapOf('G' to 'C', 'C' to 'G', 'A' to 'U', 'T' to 'A')
fun transcribeToRna(dna: String): String = dna.map { rna[it] }.joinToString("")
