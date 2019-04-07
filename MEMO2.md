# Clean Architecture Java のアーキテクチャについてのメモ

## 実現したいこと

「データベースにユーザー情報を登録するAPI」を通してクリーンアーキテクチャを理解する。

### 要件

- ユーザー名をデータとしてPOSTする
- データベースにユーザー名と作成日時を登録する
- 登録したユーザーのユーザーIDと作成日時をレスポンスする

## クリーンアーキテクチャとパッケージ構成の対応

### Enterprise Business Rules

- Entities: architecture.domain

### Application Business Rules

- Use Cases: architecture.usecases

- (Interactor: architecture.usecases.interactor)

### Interface Adapters: architecture.interfaces

- Controllers: architecture.interfaces.controllers

- Gateways: architecture.interfaces.gateways

- Presenters: architecture.interfaces.presenters
