package com.example.chapter20.gamecrud;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchResponseDto {
    private Integer count;          // 전체 검색 결과 개수
    private List<GameDto> list;     // 실제 게임 목록
    private Integer curPage;        // 현재 페이지 번호
    private Integer rowsPerPage;    // 한 페이지당 개수

    // Request에서 페이지 정보 복사해오는 메서드
    public void setData(SearchRequestDto requestDto) {
        this.setCurPage(requestDto.getCurPage());
        this.setRowsPerPage(requestDto.getRowsPerPage());
    }
}
