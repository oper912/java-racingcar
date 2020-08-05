package racing.message;

public enum ViewMsg {
    START_MSG_CAR("자동차 대수는 몇 대 인가요?"),
    START_MSG_REPEAT("시도할 회수는 몇 회 인가요?"),
    RESULT_VIEW_START("실행 결과"),
    END_LINE("****************************");


    String msg;

    ViewMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
