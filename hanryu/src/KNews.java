enum KNews {
    //5. 2021년 소식 열거형
    March("방탄소년단(BTS), 국재음반산업협회(IFPI)가 뽑온 2020년 베스트셀링 아티스트 선정, 영어 노래가 주가 아닌가수로서첫사례 "),
    April("배우 윤여정, ＜미나리>로 재 93l미 미국 아카데미 시상식에서 여우조연상 수상 "),
    May("방탄소년단(BTS) 디지털 싱글 영어 곡 <버터> 전세계 Al 발매 - (8월 일) 아시아 가수 죄조로 빌보드 Hot 100 10주 위 기록 \n 음악 예능 프로그램 '복면가왕 아마존에 포맷 수출, 국내 예능 조 온라인 등영상 서비스 플랫폼(OTT: \nOve The Top, 이하 OTT) 작폼 선보일 예정 "),
    June("방탄소년단(BTS), ＜버터 (BUTTER) ＞, <퍼미션 투 댄스(Permission to Dance)>, ＜마이 유니버스(MyUniverse)> 곡으로 빌보드 Hot 100' 연간 총 12주 위 기록 "),
    September("블랙핑크 멤버 리사, 태국 전통적 요소 담은 솔로 앨법 《라리사(LALISA)》 발매 \n- 타이틀곡 <라리사> 영국 오피셜 차트(Official charts) 68위 데뷔, 미국 빌보드 Hot 100 84위 데뷔\n<오징어 게임> 넷플릭스통해 전세계 런칭"),
    November("크래프튼, ＜배틀그라운드>의 신작 <배틀그라운드 : 뉴스테이트(NEW STATE)> 글로벌 출시 ");

    private String News;

    KNews(String News) {
        this.News = News;
    }

    public String getNews() {
        return News;
    }
}
