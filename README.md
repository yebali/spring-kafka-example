# 사용 방법

1. docker-compose-kafka.yml을 사용해 Kafka cluster 생성
2. producer/consumer 서버 실행.
3. producer에게 아래 요청을 보내 메세지를 발행.

```bash
curl -X POST http://127.0.0.1:8080/produce \
     -H "Content-Type: application/json" \
     -d '{"topic": "random-uuid"}'
```