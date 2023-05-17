import { WebPlugin } from '@capacitor/core';

import type { CapacitorPassToWalletPlugin } from './definitions';

export class CapacitorPassToWalletWeb
  extends WebPlugin
  implements CapacitorPassToWalletPlugin {
  addMultipleToWallet(options: { base64: string[]; }): Promise<{ value: string; }> {
    console.log(options.base64, 'Method not implemente on web.');
    throw new Error('Method not implemented.');
  }
  addToWallet(options: { base64: string }): Promise<{ value: string; }> {
    console.log(options.base64, 'Method not implemente on web.');
    throw new Error('Method not implemented on web.');
  }
  passExists(options: { base64: string; }): Promise<{ passExists: boolean; }> {
    console.log(options.base64, 'Method not implemente on web.');
    throw new Error('Method not implemented on web.');
  }
}
