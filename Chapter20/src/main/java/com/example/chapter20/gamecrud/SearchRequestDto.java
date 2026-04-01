package com.example.chapter20.gamecrud;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//검색 조건 담는 상자
public class SearchRequestDto {
    private String searchName;    // 검색할 게임 이름
    private String searchGrade;   // 검색할 게임 등급
    private Integer curPage;      // 현재 페이지 번호
    private Integer rowsPerPage;  // 한 페이지당 보여줄 개수

    public void calculate() {
        // DB offset 계산 (몇 번째 데이터부터 가져올지)
        // 예: 2페이지, 5개씩이면 → (2-1) * 5 = 5번째부터 가져옴
        this.curPage = (this.curPage - 1) * this.rowsPerPage;
    }
}
