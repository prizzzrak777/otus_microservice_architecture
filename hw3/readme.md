# Домашнее задание к уроку 3

## [Описание задания](hw3.md)
## [Манифесты](k8s_manifests)

:exclamation: в deployment прописан образ для архитектуры
**`linux/arm64 : prizzzrak777/hw3_docker_arm:latest`**
можно поменять на аналогичный для
**`linux/amd64 : prizzzrak777/hw3_docker:latest`**

### Применить
```bash
 kubectl create namespace smv
 kubectl apply -f ./k8s_manifests/. --namespace=smv
```
### Проверка
```bash
kubectl get all --namespace=smv
kubectl get ingress --namespace=smv
```

## [Postman collection](hw3.postman_collection.json)
```bash 
  newman run hw3.postman_collection.json
```

## Clean up
```bash 
  kubectl delete ns smv
```
