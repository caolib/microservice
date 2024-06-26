package com.clb.service;


import com.clb.common.domain.Borrow;
import com.clb.common.domain.Result;
import com.clb.common.domain.vo.BorrowVo;

import java.sql.Date;
import java.util.List;

public interface BorrowService {


    Result<List<BorrowVo>> getBorrowByReaderId();

    Result<String> borrow(String isbn, Date dueDate);

    Result<String> returnBook(Integer id, String isbn);

    Result<String> deleteById(Integer id);

    Result<String> deleteBatchByIds(List<Integer> ids);


    List<Borrow> getBorrowByIsbn(String isbn);

    Result<String> borrow2(String isbn, Date borrow, Date due);
}
