# BaekjoonHub
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).


<br><br>

>  **BigInteger**
>
>  - 언제? : java에서 int나 long의 **데이터 타입 범위를 벗어나는 경우**에 사용
>  - 선언 : `BigInteger` result;
>  - 사칙연산 등의 사용 : result.`multiply()`;
>  - 몫과 나머지 : `divideAndRemainder()` 사용, 배열의 형태로 첫번재 값은 몫, 두번째 값은 나머지를 전달해줌
>  - 0,1,2,10 사용 : `BigInteger.ZERO`, `BigInteger.One` ...
>  - 정수 1을 BigInteger 객체로 변환하는 정적 메서드 : `BigInteger.valueOf(i)`
>  - 예제 :  [1247번: 부호 (acmicpc.net)](https://www.acmicpc.net/problem/1247),  [1010번: 다리 놓기 (acmicpc.net)](https://www.acmicpc.net/problem/1010), [2338번: 긴자리 계산 (acmicpc.net)](https://www.acmicpc.net/problem/2338)

 <br>

> **for-each문**
>
> - 언제? : **배열 또는 컬렉션의 각 요소를 순회**하는 데 사용
>
> - 형태
>
> ```java
> for (type variableName : arrayName) {
> // 반복할 내용
> }
> ```
>
> `type`은 배열 또는 컬렉션의 요소 유형. `variableName`은 반복 중인 요소를 저장할 변수 이름 		`arrayName`은 반복할 배열 또는 컬렉션.
>
> - 사용예시
>
> ```java
> int[] numbers = {1, 2, 3, 4, 5}; 
> for (int number : numbers) {
>     System.out.println(number);
> }
> ```

<br>

> **조합**
>
> nCk = n! / (k! * (n-k)!)

<br>

> **해당 방까지의 최소거리 구하기**
>
> ```java
> 			int passNum = 1; //통과한 벌집 수
> 			int maxRoom = 1; //현재 passNum에서 도달할 수 있는 가장 큰 값을 지닌 벌집
> 			int increment = 6; //방의 증가량
> 			
> 			while(true) {
> 				maxRoom += increment; //도달할 수 있는 가장 큰 값을 지닌 벌집 업데이트
> 				
> 				if(roomNum<=maxRoom) {	//현재 도달할 수 있는 maxRoom보다 입력한 roomNum이 작을 시	
> 					System.out.println(passNum + 1);
> 					break;
> 				}
> 				passNum++;
> 				increment += 6;			
> 			}
> ```

<br>

> **ArrayList를 요소 하나씩 출력하는 방법**

<br>

> **3키로와 5키로의 설탕을 가지고 가장 적은 봉지로 주어진 설탕을 나누기**
>
> -> 처음부터 규칙을 발견하려고 하지 말고 각각의 경우를 써가며 패턴을 찾기
>
> 설탕은 5,3. 입력값을 5로 나누었을 때 나머지를 가지고 규칙을 발견하자.
>
> https://www.acmicpc.net/problem/2839

<br>

> **소수판별을 위한  에라토스테네스의 체 알고리즘**

<br>

> **sc.next() 와  sc.nextInt()**
>
> next() : 공백문자를 기준으로 한 단어씩 입력을 받음. 사용자가 공백을 입력하면 입력이 종료됨
>
> nextLine() : 한 줄 전체를 입력으로 받음. 공백이 포함된 문자열이나 빈 줄도 입력으로 받음
