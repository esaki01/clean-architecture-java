# クリーンアーキテクチャ理解のためのメモ

![9e81aff57482b9d4b6c7782ced66e55c-png (1)](https://user-images.githubusercontent.com/44774033/55669786-5e3f2700-58b6-11e9-93ef-96ee10d24100.png)

## Enterprise Business Rules

Enterprise Business Rulesは、ビジネスロジックを表現するオブジェクトが所属するレイヤーです。
ドメイン駆動設計でいうところのエンティティなどはここに所属します。

### Entities

Entitiesは、ドメイン（アプリケーションが対象とする業務領域）に必要なデータとそれに対するメソッドのセットのことを指します。

## Application Business Rules

Application Business Rulesは、「ソフトウェアが何ができるのか」を表現します。
内側のレイヤーのEnterprise Business Rulesに所属するオブジェクトに依存し、ユースケースを達成します。
ドメイン駆動設計でいうところのアプリケーションサービスなどはここに所属します。

### Use Cases

Use Casesは、ユースケースを表現するクラス群です。列挙型や値オブジェクトを利用したい場合は、Application Business Rulesより内側のレイヤーのEnterprise Business Rulesレイヤーの型であれば参照しても問題ないです。
Entitiesを利用してビジネスロジックを実現します。

#### Interactor

Use Casesは、interfaceで用意されているのでその実装はありません。
Interactorと呼ばれるオブジェクトで実装します。

## Interface Adapters

Interface Adaptersは、入力、永続化、表示を担当するオブジェクトが所属するレイヤーです。
入力は、内側のレイヤーのApplication Business Rulesに伝えるためのデータ加工を指します。
永続化は、データの保存を指します。
表示は、結果の表示です。

### Controllers

Controllersは、ユーザの入力を解釈し、Use Casesにそれを伝えます。
Presentersが出力（表示）のための変換を行うのに対して、Controllersは、入力をUse Casesのために変換します。

### Gateways

Repositoryがここにあたります。Gatewaysは、特定のモデルのデータ永続化について抽象化したオブジェクトです。

### Presenters

Presentersは表示するためのデータ加工を主な目的とします。

## Frameworks & Drivers

Web フレームワークやデータベース操作オブジェクトなどのギークなコードがここに所属します。
フロントエンドのUIなどもここに所属しています。
