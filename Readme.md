# 문자열 메서드 정리

### 아스키코드

> 숫자 : 0(48) ~ 9(57)  
> 대문자 : 65(A) ~ 90(Z)  
> 소문자 : 97(a) ~ 122(z)  
> 소문자에서 32를 빼면 대문자가 됨  
> 대문자에서 32를 더하면 소문자가 됨

<br>

```java
indexOf()
```

특정 문자나 문자열을 앞에서 부터 처음 발견되는 인덱스를 반환함
만약 찾지 못 할 경우 -1 반환

- 첫번째 인자 : 찾을 특정 문자
- 두번째 인자 : 시작할 위치

<br>

```java
lastIndexOf()
```

특정 문자나 문자열을 뒤에서 부터 처음 발견되는 인덱스를 반환함
먄약 찾지 못 할 경우 -1 반환

- 첫번째 인자 : 찾을 특정 문자
- 두번째 인자 : 시작할 위치

<br>

```java
substring()
```

문자열를 잘라서 반환함 만약 종료값을 생략하면 시작값부터
문자열 끝까지 문자열을 자른다

- 첫번째 인자 : 시작값
- 두번째 인자 : 종료값 (종료값은 포함 안됨)

<br>

```java
substr()
```

문자열을 잘라서 반환함 만약 길이를 생략하면 시작값부터 문자열 끝까지 문자열을 자른다.

- 첫번째 인자 : 시작값
- 두번째 인자 : 길이

<br>

```java
문자열.charAt()
```

문자열 인덱스에 해당하는 문자를 char 타입으로 반환함

- 첫번째 인자 : 찾을 index 값

<br>

```java
문자열.toUpperCase()
```

문자열의 알파벳을 전부 대문자로 변경함

<br>

```java
문자열.toLowerCase()
```

문자열의 알파벳을 전부 소문자로 변경함

<br>

```java
Character.isAlphabetic()
```

char 타입의 문자가 알파벳이면 true, 아니면 false를 리턴함

- 첫번째 인자 : 알파벳인지 체크할 문자

<br>

```java
Character.toUpperCase()
```

char 타입의 문자를 대문자로 변경

- 첫번째 인자 : 대문자로 변경할 문자

<br>

```java
Character.toLowerCase()
```

char 타입의 문자를 소문자로 변경

- 첫번째 인자 : 소문자로 변경할 문자

<br>

```java
Character.isUpperCase()
```

문자가 대문자면 true 아니면 false를 반환함

<br>

```java
Character.isLowerCase()
```

문자가 소문자면 true 아니면 false를 반환함

<br>

```java
문자열.toCharArray()
```

문자열을 char배열 타입으로 반환함

<br>

```java
문자열.split()
```

문자열을 잘라서 String 배열로 반환함

- 첫번째 인자 : 구분자 (자를 기준)
- 두번째 인자 : 배열의 크기

<br>

```java
StringBuilder객체.reverse()
```

문자열을 뒤집은 값을 StringBuilder 객체타입으로 반환한다.

<br>

```java
문자열.equals()
```

문자열과 비교할 문자열를 서로 비교하여 같으면 true, 다르면 false를 리턴함

- 첫번째 인자 : 비교할 문자열

<br>

```java
문자열.equalsIgnoreCase()
```

대소문자를 구분하지 않고 문자열과 비교할 문자열를 서로 비교하여 같으면 true, 다르면 false를 리턴함

- 첫번째 인자 : 비교할 문자열

<br>
