# capacitor-pass-to-wallet

Allow to add .pkpass file to Apple Wallet

## Install

```bash
npm install @atroo/capacitor-pass-to-wallet
npx cap sync
```

## Compatibility

| Capacitor Version  | Plugin Version |
| ------------- | ------------- |
| 4.x  | 1.x  |
| 5.x  | 2.x |
| 6.x  | 3.x |
| 7.x  | 4.x |

## API

<docgen-index>

* [`addToWallet(...)`](#addtowallet)
* [`addMultipleToWallet(...)`](#addmultipletowallet)
* [`passExists(...)`](#passexists)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addToWallet(...)

```typescript
addToWallet(options: { base64: string; }) => Promise<{ value: string; }>
```

| Param         | Type                             |
| ------------- | -------------------------------- |
| **`options`** | <code>{ base64: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### addMultipleToWallet(...)

```typescript
addMultipleToWallet(options: { base64: string[]; }) => Promise<{ value: string; }>
```

| Param         | Type                               |
| ------------- | ---------------------------------- |
| **`options`** | <code>{ base64: string[]; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### passExists(...)

```typescript
passExists(options: { base64: string; }) => Promise<{ passExists: boolean; }>
```

| Param         | Type                             |
| ------------- | -------------------------------- |
| **`options`** | <code>{ base64: string; }</code> |

**Returns:** <code>Promise&lt;{ passExists: boolean; }&gt;</code>

--------------------

</docgen-api>
