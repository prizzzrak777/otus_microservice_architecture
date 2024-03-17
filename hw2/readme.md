# Домашнее задание к уроку 2

## [Описание задания](hw2.md)

Собран докер образ под архитектуру linux/amd64

### Pull container
```bash 
docker pull prizzzrak777/otus_msa_hw2:latest
```

### Docker container run 
```bash
docker run --rm --name hw2-docker -p 8000:8000 -d prizzzrak777/otus_msa_hw2:latest
```

### Проверка
```bash
curl http://localhost:8000/health/
```

### Docker container stop and delete
```bash 
docker stop hw2-docker
```