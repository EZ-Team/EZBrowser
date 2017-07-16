import { EZBrowserPage } from './app.po';

describe('ez-browser App', () => {
  let page: EZBrowserPage;

  beforeEach(() => {
    page = new EZBrowserPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
