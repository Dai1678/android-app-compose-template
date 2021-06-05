---
title: Setup layout: default
---

## プロジェクトのセットアップについて

### パッケージ名の変更

まず初めに必ず ① `app/build.gradle` と ② `app/src/main/AndroidManifest.xml` にある `dev.dai.sample`
を適切なパッケージ名に変更してください。

① app/build.gradle

```
  defaultConfig {
    applicationId "dev.dai.compose_sample" // ← 修正
    ...
  }
```

② app/src/main/AndroidManifest.xml

```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
  package="dev.dai.compose_sample"> //  ← 修正
```

### アプリ名の変更

`strings.xml` にある `app_name` を適切な名前に変更してください。

* app/src/debug/res/values/strings.xml
* app/src/demo/res/values/strings.xml
* app/src/main/res/values/strings.xml

```
<resources>
  <string name="app_name">android-app-compose-template</string> // ← 修正
</resources>
```

### DeployGateのCIのセットアップ

`.github/workflows/deploy_to_deploygate.yml` にある `distribution_name` を適切な名前に変更してください。

```
- name: Distribute App
    run: |
      curl -X POST \
        -sSfL \
        -H "Authorization: token ${{secrets.DEPLOY_GATE_API_KEY}}" \
        -F "message=Build on $(date +'%Y-%m-%d')" \
        -F "distribution_name=android-app-compose-template" \ // ← 修正
        -F "file=@app/build/outputs/apk/demo/app-demo.apk" \
        "https://deploygate.com/api/users/${{secrets.DEPLOY_GATE_USER_NAME}}/apps"
```

### ReleasesHubのセットアップ

`app/build.gradle.kts` の `releasesHub.gitHubRepositoryName` を適切な名前に変更してください。

```
releasesHub {
  dependenciesClassNames = listOf("Versions.kt")
  pullRequestsMax = 10
  baseBranch = "develop"
  gitHubRepositoryOwner = "Dai1678"
  gitHubRepositoryName = "android-app-compose-template" // ← 修正
}
```

長期的にプロジェクトを開発する場合は、週１で自動的にdependenciesをアップデートするように `.github/workflows/weekly_upgrade_dependencies.yml`
を修正してください。

* テンプレートリポジトリや、短期間での開発の場合

```
on: [ workflow_dispatch ] // ← Github Webサイトの Actions から手動でworkflowを実行する設定
```

* 長期的な開発の場合

```
on:
  repository_dispatch:
  schedule:
    - cron: '0 12 * * 6' // ← 指定時間に自動的にworkflowを実行する設定
jobs:
  update_dependencies:
    if: (github.event_name == 'repository_dispatch' && github.event.action == 'update_dependencies') ||
      (github.event_name == 'schedule')
    runs-on: ubuntu-latest
```

### Github Actionsのセットアップ

それぞれ次の環境変数をGithubに設定しましょう。

| 環境変数名 | 説明 | 取得方法 |
| --- | --- | --- |
| DEPLOY_GATE_API_KEY | DeployGateで使用するToken | [DeployGate設定画面 API key](https://deploygate.com/settings) |
| DEPLOY_GATE_USER_NAME | デプロイ先のユーザー名 | [DeployGate設定画面 プロフィール](https://deploygate.com/settings) |
| USER_NAME | ReleasesHubで自動的にPRを作るために必要 | Githubのユーザーネーム |
| USER_EMAIL | ReleasesHubで自動的にPRを作るために必要 | Gitで使用しているメールアドレスなど |
| SIGNING_KEY | PlayConsoleにアップロードするAABの署名に必要 | AndroidStudioで署名に使用した値 |
| ALIAS | PlayConsoleにアップロードするAABの署名に必要 | AndroidStudioで署名に使用した値 |
| KEY_STORE_PASSWORD | PlayConsoleにアップロードするAABの署名に必要 | AndroidStudioで署名に使用した値 |
| KEY_PASSWORD | PlayConsoleにアップロードするAABの署名に必要 | AndroidStudioで署名に使用した値 |
| SERVICE_ACCOUNT_JSON | PlayConsoleにアップロードするために必要 | PlayConsole APIアクセス サービスアカウント で作成したJSON |

### PlayConsoleにアップロードするworkflowのセットアップ

`.github/workflows/deploy_google_play.yml` の `packageName` を適切なパッケージ名に変更してください。
`BUILD_TOOLS_VERSION` が設定されている値と異なっていたら変更してください。

```
- name: Sign AAB
    uses: r0adkll/sign-android-release@v1
    with:
      releaseDirectory: app/build/outputs/bundle/release
      signingKeyBase64: ${{ secrets.SIGNING_KEY }}
      alias: ${{ secrets.ALIAS }}
      keyStorePassword: ${{ secrets.KEY_STORE_PASSWORD }}
      keyPassword: ${{ secrets.KEY_PASSWORD }}
    env:
      BUILD_TOOLS_VERSION: "30.0.3" // ← build.gradleで設定している値と同じものに修正
```

```
- name: Deploy to Play Store (INTERNAL)
    uses: r0adkll/upload-google-play@v1
    with:
      serviceAccountJson: service_account.json
      packageName: dev.dai.sample // ← 修正
      releaseFile: app/build/outputs/bundle/release/app-release.aab
      track: internal
```

### Github Pages のセットアップ

* Settings -> Github Pages で Branch を `main` にして ディレクトリを `docs` を選べば、ドキュメントが公開されます。
