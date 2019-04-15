# Clean Architecture Java のアーキテクチャについてのメモ

## 実現したいこと

「データベースにユーザー情報を登録するAPI」を実装してクリーンアーキテクチャを理解する。

### 要件

- APIにリクエストする
  - HTTP Method: POST
  - Request Body: ユーザー名
- データベースにユーザー名とユーザー作成日時を登録する
- 登録したユーザーのIDと作成日時をレスポンスする

## クリーンアーキテクチャとパッケージ構成の対応

### Enterprise Business Rules

- Entities: architecture.domain

### Application Business Rules

- Use Cases: architecture.usecases

- (Interactor: architecture.usecases.interactor)

### Interface Adapters

- Controllers: architecture.interfaces.controllers

- Gateways: architecture.interfaces.gateways

- Presenters: architecture.interfaces.presenters
