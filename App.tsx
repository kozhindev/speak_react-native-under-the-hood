/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * Generated with the TypeScript template
 * https://github.com/react-native-community/react-native-template-typescript
 *
 * @format
 */

import React, {Component} from 'react';
import {
  StyleSheet,
  View,
  Text,
  requireNativeComponent
} from 'react-native';

const SimpleButton = requireNativeComponent("SimpleButton")

export default class App extends Component {
  constructor(props: any) {
    super(props);
    this._onStatusChange = this._onStatusChange.bind(this);
    this.state = {isOn: false};
  }

  _onStatusChange = e => {
    this.setState({isOn: e.nativeEvent.isOn});
  }

  render() {
    return (
        <View style={styles.container}>
          <View style={styles.top}>
            <Text>This state of Bulb come from Native Code to JavaScript</Text>
            <Text>{this.state.isOn ? "Bulb is On" : "Bulb is Off"}</Text>
          </View>

          <SimpleButton
              style={styles.bottom}
              isOn={this.state.isOn}
              onStatusChange={this._onStatusChange}
          />

        </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F5FCFF',
  },
  top: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },
  bottom: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },
});
