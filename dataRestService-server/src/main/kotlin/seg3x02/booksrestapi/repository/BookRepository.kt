package seg3x02.booksrestapi.repository

import org.springframework.data.repository.CrudRepository
import seg3x02.booksrestapi.entities.Book

interface BookRepository: CrudRepository<Book, Long>

fun findByTitleContainingIgnoreCase(title: String): List<Book>
fun findByCategoryContainingIgnoreCase(category: String): List<Book>
