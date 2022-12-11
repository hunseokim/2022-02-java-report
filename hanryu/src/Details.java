class Details {
    //3-상세정보 출력을 위한 클래스
    ContentDetails printContent = null;

    void setClass(String content) {
        if (content.equals("드라마")) {
            printContent = new dramaD();
            print();
        } else if (content.equals("영화")) {
            printContent = new movieD();
            print();
        } else if (content.equals("음악")) {
            printContent = new songD();
            print();
        } else if (content.equals("게임")) {
            printContent = new gameD();
            print();
        } else {
            System.out.println("해당 컨텐츠가 존재하지 않거나 잘못된 입력 입니다.");
        }
    }

    void print() {
        printContent.percentDetail();
        printContent.countryDetail();
        printContent.reasonDetail();
        printContent.favoriteDetail();
    }
}
