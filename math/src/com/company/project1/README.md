### 단어 중복 갯수 파악하기

    긴~~~~~~ 문장을 띄어쓰기로 구분하여 각각 단어로 봤을 때,
    그 단어들이 중복되는 갯수를 파악하라!

### Solution

    처음에는 ArrayList<String>에 넣고 이중 for문을 돌려서 했다.
    그러니, 각 단어에 중복되는 갯수를 넣기 위해 HashMap<String, Integer>를 만들었는데
    생각해보니 ArrayList<String>은 없어도 될듯함..