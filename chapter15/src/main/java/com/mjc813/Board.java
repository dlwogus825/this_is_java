package com.mjc813;

/**
 * 게시판의 게시글 하나를 표현하는 클래스
 * - 제목(subject), 내용(content), 작성자(writer) 정보를 저장한다
 */
public class Board {

    // 게시글 제목
    private String subject;

    // 게시글 내용
    private String content;

    // 게시글 작성자 이름
    private String writer;

    /**
     * 생성자: 게시글 객체를 만들 때 제목, 내용, 작성자를 한 번에 초기화
     * 예) Board post = new Board("공지사항", "내일 휴무입니다", "관리자");
     */
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    // ── Getter / Setter ──────────────────────────────────────────────
    // Getter: 외부에서 값을 읽을 때 사용
    // Setter: 외부에서 값을 변경할 때 사용
    // private 필드를 직접 노출하지 않고 메서드로 접근하는 '캡슐화' 패턴

    /** 제목 반환 */
    public String getSubject() { return subject; }

    /** 제목 변경 */
    public void setSubject(String subject) { this.subject = subject; }

    /** 내용 반환 */
    public String getContent() { return content; }

    /** 내용 변경 */
    public void setContent(String content) { this.content = content; }

    /** 작성자 반환 */
    public String getWriter() { return writer; }

    /** 작성자 변경 */
    public void setWriter(String writer) { this.writer = writer; }
}