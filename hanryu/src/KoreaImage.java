class KoreaImage extends ImageYear {
    //1.연도별 한국 연상 이미지 자식 클래스
    int year;

    public void yearSet(int year) {
        this.year = year - St;
    }

    public void rankNum() {
        System.out.printf("%-7s %-7s %-7s %-7s %-7s", "1위", "2위", "3위", "4위", "5위");
    }

    public void rankShow() {
        String testRank = ranks[year][0];
        System.out.println(year + 2014 + "년의 한국과 연상되는 이미지는 다음과 같습니다.");
        rankNum();
        System.out.printf("\n%-6s %-6s %-6s %-6s %-6s\n", ranks[year][0], ranks[year][1], ranks[year][2], ranks[year][3], ranks[year][4]);
    }
}
