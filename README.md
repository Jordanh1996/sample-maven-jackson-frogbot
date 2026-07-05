# sample-maven-jackson-frogbot

Repro for [XRAY-1008336](https://jfrog-int.atlassian.net/browse/XRAY-1008336) / CVE-2026-54515 on **tokyoshiftleft**.

Direct Maven dependency: `com.fasterxml.jackson.core:jackson-databind@2.18.8`.

## Frogbot

- Tenant: `https://tokyoshiftleft.jfrog.io/`
- Repo scan via `.github/workflows/frogbot-scan-repository.yml`
- Platform profile must have **SCA enabled** + **Create automated fixes** (`create_auto_fix_pr`)

On tokyoshiftleft (2026-07-05), remediation returns `NoFixVersion` for this CVE — Frogbot detects the vulnerability but does **not** open a fix PR. Use `frogbot-monorepo-demo` (npm minimatch) to verify fix-PR mechanics on the same tenant.
