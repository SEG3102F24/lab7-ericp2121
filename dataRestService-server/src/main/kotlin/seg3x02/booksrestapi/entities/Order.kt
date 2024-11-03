package seg3x02.booksrestapi.entities

import jakarta.persistence.*

@Entity
@Table(name = "BookOrder")
class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var quantity: Int = 0

    @ManyToOne
    @JoinColumn(name = "book_id")
    var book: Book? = null


}
