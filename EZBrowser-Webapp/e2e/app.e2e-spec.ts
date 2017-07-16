import { EZBrowserWebappPage } from './app.po';

describe('ezbrowser-webapp App', () => {
  let page: EZBrowserWebappPage;

  beforeEach(() => {
    page = new EZBrowserWebappPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
