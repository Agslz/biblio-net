package com.ags.book.history;

import com.ags.book.book.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTranstacionHistory,Integer> {
    @Query("""
            SELECT history
            FROM BookTranstacionHistory history
            WHERE history.user.id = :userId
            """)
    Page<BookTranstacionHistory> findAllBorrowedBooks(Pageable pageable, Integer userId);

    @Query("""
            SELECT history
            FROM BookTranstacionHistory history
            WHERE history.book.owner.id = :userId
            """)
    Page<BookTranstacionHistory> findAllReturnedBooks(Pageable pageable, Integer userId);

    @Query("""
            SELECT
            (COUNT(*) > 0) AS isBorrowed
            FROM BookTranstacionHistory bookTransactionHistory
            WHERE bookTransactionHistory.user.id =: userId
            AND bookTransactionHistory.book.id = :bookId
            ANd bookTransactionHistory.returnApproved = false
            """)
    boolean isAlreadyBorrowedByUser(Integer bookId, Integer userId);

    @Query("""
    SELECT transaction
    FROM BookTranstacionHistory  transaction
    WHERE transaction.user.id = :userId
    AND transaction.book.id = :bookId
    AND transaction.returned = false
    AND transaction.returnApproved = false
            """)
    Optional<BookTranstacionHistory> findByBookIdAndUserId(Integer bookId, Integer userId);

     @Query("""
             SELECT transaction
                 FROM BookTranstacionHistory  transaction
                 WHERE transaction.book.owner.id = :userId
                 AND transaction.book.id = :bookId
                 AND transaction.returned = true
                 AND transaction.returnApproved = false 
             """)
    Optional<BookTranstacionHistory> findByBookIdAndOwnerId(Integer bookId, Integer userId);
}
