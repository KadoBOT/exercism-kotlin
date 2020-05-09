import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(initialDate: LocalDateTime) {

    val date: LocalDateTime = initialDate.plusSeconds(1_000_000_000)

    constructor(initialDate: LocalDate) : this(initialDate.atStartOfDay())
}
