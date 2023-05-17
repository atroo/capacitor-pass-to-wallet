export interface CapacitorPassToWalletPlugin {
  addToWallet(options: { base64: string }): Promise<{ value: string }>;
  addMultipleToWallet(options: { base64: string[] }): Promise<{ value: string }>;
  passExists(options: { base64: string }): Promise<{ passExists: boolean }>;
}

