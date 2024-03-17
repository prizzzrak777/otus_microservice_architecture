# Домашнее задание к уроку 3

## [Описание задания](hw3.md)
## [Манифесты](k8s_manifests)
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
