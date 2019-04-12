import * as React from 'react';
import { Route, Switch } from 'react-router';
import ConnectionsCreatorApp from './ConnectionsCreatorApp';
import { ConnectionsPage } from './pages';
import routes from './routes';

export class ConnectionsModule extends React.Component {
  public render() {
    return (
      <Switch>
        <Route path={routes.create.root} component={ConnectionsCreatorApp} />
        <Route path={routes.connections} component={ConnectionsPage} />
      </Switch>
    );
  }
}
