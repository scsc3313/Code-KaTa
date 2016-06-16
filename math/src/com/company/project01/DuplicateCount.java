package com.company.project01;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DuplicateCount {

    private HashMap<String, AtomicInteger> duplicateCountHashMap;

    DuplicateCount() {
        duplicateCountHashMap = new HashMap<>();
    }

    public static void main(String[] args) {
        DuplicateCount main = new DuplicateCount();
        main.control();
    }

    private void control() {


        String content = "신 전 부회장은 10일 검찰 압수수색 소식을 접하고 상당히 놀란 것으로 전해졌다. 이어 긴급성명을 통해 \"창업 이후 최대 위기상황이라는 중대성에 비춰 정기 주총에 앞서 롯데홀딩스 및 종업원지주이사회에 대해 경영정상화를 위한 긴급협의의 장을 설치하길 요구한다\"고 밝혔다.\n" +
                "\n" +
                "지난해 8월과 올해 3월 임시주총에서 모두 동생 신 회장에게 완패했던 신 전 회장이 이달 정기 주총에서 자신의 이사 선임과 신 회장의 이사직 해임 등을 재시도하겠다는 선전포고에 다름 아니다.\n" +
                "\n" +
                "이미 지난 2일 검찰의 면세점 입점 로비 의혹 관련 압수수색 직후 “롯데홀딩스 경영진의 책임을 추궁하겠다”고 공언한 상황에서 이번 압수수색은 신 전 부회장에게는 더할 나위 없이 좋은 공격 포인트다.\n" +
                "\n" +
                "신 회장이 이사회를 장악한 롯데홀딩스는 호텔롯데의 최대주주로서 한·일 롯데의 지주회사 격이다. 그런데 롯데홀딩스의 최대주주는 광윤사로서 신 전 부회장은 광윤사의 지분 '50%+1주'를 가진 최대주주이자 대표이사다.\n" +
                "\n" +
                "신 회장은 미국 석유화학업체 액시올(Axiall) 인수를 직접 챙기기 위해 지난 7일 출국했지만 끝내 액시올 인수 계획을 철회했다.\n" +
                "\n" +
                "신 회장은 당초 예정대로 일정을 진행할 방침인 것으로 전해졌지만 자신을 직접 겨냥하고 들어온 검찰의 칼날은 글로벌 화학업계 12위권 도약의 야심도 접을 수 밖에 없었다.\n" +
                "\n" +
                "신 전 부회장으로서는 절호의 기회지만 그 역시 롯데 일가라는 점에서 신 회장의 '원(one) 롯데, 원 리더' 체제를 뒤집고 역전에 성공할 수 있을지는 미지수다.";

        String[] tokens = content.split(" ");
        for (String token : tokens) {
            AtomicInteger count = duplicateCountHashMap.get(token);
            if (count == null) {
                count = new AtomicInteger(0);
            }
            count.incrementAndGet();
            duplicateCountHashMap.put(token, count);
        }

        System.out.println(duplicateCountHashMap);
    }

}
